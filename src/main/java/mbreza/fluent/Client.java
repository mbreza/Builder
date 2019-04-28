package mbreza.fluent;

public class Client
{
    public String FirstName;
    public String LastName;

    public Client(Builder builder)
    {
        FirstName = builder.firstName;
        LastName = builder.lastName;
    }

    public static class Builder
    {
        public String firstName;
        public String lastName;

        public Builder FirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder LastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Client build()
        {
            return new Client(this);
        }
    }
}