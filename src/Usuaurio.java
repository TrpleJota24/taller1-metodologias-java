public class Usuaurio {
    private int id;
    private String name;
    private String lastName;
    private String correoElectronico;
    private String password;

    public Usuaurio(int id, String name, String lastName, String correoElectronico, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
