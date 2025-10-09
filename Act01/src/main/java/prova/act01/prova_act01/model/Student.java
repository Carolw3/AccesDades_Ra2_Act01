package prova.act01.prova_act01.model;

public class Student {
    private int age;
    private String nom;
    private String cognom;
    private int any;
    private String cicle;
    private long id;


    
    public Student() {
    }
    public Student(int age, String nom, String cognom, int any, String cicle, long id) {
        this.age = age;
        this.nom = nom;
        this.cognom = cognom;
        this.any = any;
        this.cicle = cicle;
        this.id = id;
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
