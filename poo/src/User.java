public class User {
    private String firstName;
    private String lastName;

    // Construtor
    public User(String fisrtName, String lastName) {
        this.firstName = fisrtName;
        this.lastName = lastName;
    }
    
    
    //setter
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    // getter

    public String getFullName() {
        return ("""
                %s %s
                """.formatted(firstName, lastName));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}

