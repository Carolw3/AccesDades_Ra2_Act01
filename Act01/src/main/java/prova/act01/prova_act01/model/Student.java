package prova.act01.prova_act01.model;

public class Student {
    private long id;
    private String nom;
    private String cognom;
    private int age;
    private String cicle;
    private int any;

    
    public Student() {

    }


    public Student( long id, String nom, String cognom, int age, String cicle, int any) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.any = any;    
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognom() {
        return cognom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public int getAny() {
        return any;
    }
    public void setAny(int any) {
        this.any = any;
    }
    public String getCicle() {
        return cicle;
    }
    public void setCicle(String cicle) {
        this.cicle = cicle;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    

}
