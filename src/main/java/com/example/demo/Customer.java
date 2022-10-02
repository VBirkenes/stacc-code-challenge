package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    
    private @Id String id;
    private String schema, name, aliases, birth_date, countries, addresses, identifiers, 
    sanctions, phones, emails, dataset, last_seen, first_seen;

    public Customer() {}

    public Customer(String id, String schema, String name, String aliases, String birth_date, String countries,
        String addresses, String identifiers, String sanctions, String phones, String emails, String dataset,
        String last_seen, String first_seen) {
            this.id = id;
            this.schema = schema;
            this.name = name;
            this.aliases = aliases;
            this.birth_date = birth_date;
            this.countries = countries;
            this.addresses = addresses;
            this.identifiers = identifiers;
            this.sanctions = sanctions;
            this.phones = phones;
            this.emails = emails;
            this.dataset = dataset;
            this.last_seen = last_seen;
            this.first_seen = first_seen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schema, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(schema, customer.schema) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(aliases, customer.aliases) &&
                Objects.equals(birth_date, customer.birth_date) &&
                Objects.equals(countries, customer.countries) &&
                Objects.equals(addresses, customer.addresses) &&
                Objects.equals(identifiers, customer.identifiers) &&
                Objects.equals(sanctions, customer.sanctions) &&
                Objects.equals(phones, customer.phones) &&
                Objects.equals(emails, customer.emails) &&
                Objects.equals(dataset, customer.dataset) &&
                Objects.equals(last_seen, customer.last_seen) &&
                Objects.equals(first_seen, customer.first_seen);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", schema='" + schema + '\'' +
                ", name='" + name + '\'' +
                ", aliases='" + aliases + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", countries='" + countries + '\'' +
                ", addresses='" + addresses + '\'' +
                ", identifiers='" + identifiers + '\'' +
                ", sanctions='" + sanctions + '\'' +
                ", phones='" + phones + '\'' +
                ", emails='" + emails + '\'' +
                ", dataset='" + dataset + '\'' +
                ", last_seen='" + last_seen + '\'' +
                ", first_seen='" + first_seen + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
    }    

    public String getSanctions() {
        return sanctions;
    }

    public void setSanctions(String sanctions) {
        this.sanctions = sanctions;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getLastSeen() {
        return last_seen;
    }

    public void setLastSeen(String last_seen) {
        this.last_seen = last_seen;
    }

    public String getFirstSeen() {
        return first_seen;
    }

    public void setFirstSeen(String first_seen) {
        this.first_seen = first_seen;
    }
}
