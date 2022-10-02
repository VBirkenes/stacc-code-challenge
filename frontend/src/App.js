import { useState, Fragment } from 'react'
import Button from 'react-bootstrap/Button'
import Card from 'react-bootstrap/Card'
import Form from 'react-bootstrap/Form'

function App() {
  const [customer, setCustomer] = useState({
    name: ''
  })
  const [searchName, setSearchName] = useState('')

  const onFormSubmit = e => {
    e.preventDefault()
    performSearch()
  }

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
        </div>
      )
    }
  }

  return (
    <Fragment>
      <div style={{ display: 'flex', justifyContent: 'center'}}>
        <Card body style={{ width: '60%', backgroundColor: 'beige', marginTop: '10px', paddingBottom: '40px'}}>
          <div style={{ display: 'flex', justifyContent: 'center'}}>
            <h1>KYC Check</h1>
          </div>
          <div style={{ display: 'flex', justifyContent: 'center'}}>
            <Form className='searchForm' onSubmit={onFormSubmit}>
              <Form.Group controlId='formSearch'>
                <Form.Control type='search' placeholder='Search for a person' onChange={event => {setSearchName(event.target.value)}}></Form.Control>
                <Button variant='primary' type='submit'>
                  Submit
              </Button>
              </Form.Group>
            </Form>
          </div>
          <RenderCheck />
        </Card>
      </div>
    </Fragment>
  );
}

export default App;
