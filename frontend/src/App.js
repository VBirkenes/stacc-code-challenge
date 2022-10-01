import { useState, Fragment } from 'react'
import Button from 'react-bootstrap/Button'
import Card from 'react-bootstrap/Card'
import Form from 'react-bootstrap/Form'

function App() {
  const [customer, setCustomer] = useState({
    schema: '',
    name: ''
  })
  const [searchName, setSearchName] = useState('')

  async function performSearch() {
    await fetch(`/customers/${encodeURIComponent(searchName)}`, {
      method: 'GET'
    })
    .then(async response => {
      const body = await response.json()
      setCustomer(body)
    })
    .catch(() => alert(('Found no person with that name')))
  }

  function RenderCheck() {
    if (customer.name.length > 0) {
      return (
        <div style={{ display: 'flex', justifyContent: 'center', paddingTop: '20px'}}> 
        <Card>
          <Card.Body>
          <table>
            <tbody>
              {Object.entries(customer).map(([key, value]) => {
                return (
                  <tr key={key}>
                    <td>{key}: {value.toString()}</td>
                  </tr>
                )
              })}
            </tbody>
          </table>
          </Card.Body>
          </Card>
        </div>
      )
    }
  }

  return (
    <Fragment>
      <div style={{ display: 'flex', justifyContent: 'center'}}>
        <h1>KYC Check</h1>
      </div>
      <div style={{ display: 'flex', justifyContent: 'center'}}>
        <Form>
          <Form.Group className='mb-3' controlId='formSearch'>
            <Form.Control type='search' placeholder='Search for a person' onChange={event => {setSearchName(event.target.value)}}></Form.Control>
          </Form.Group>
        </Form>
        <Button variant="primary" type="submit" onClick={performSearch}>
          Submit
        </Button>
      </div>
      <RenderCheck />
    </Fragment>
  );
}

export default App;
