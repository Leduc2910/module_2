package People_manager;

public class People {
    private int id;
    private String name;
    private int age;
    private String job;
    private int identity;
    private static int idIncrease = 1;

    public People() {
    }

    public People(String name, int age, String job, int identity) {
        this.id = idIncrease;
        this.name = name;
        this.age = age;
        this.job = job;
        this.identity = identity;
        idIncrease++;
    }

    public People(int id, String name, int age, String job, int identity) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.identity = identity;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public static int getIdIncrease() {
        return idIncrease;
    }

    public static void setIdIncrease(int idIncrease) {
        People.idIncrease = idIncrease;
    }

    @Override
    public String toString() {
        return "\t" + id + ". Tên= " + name +
                ", tuổi= " + age +
                ", nghề nghiệp= " + job +
                ", căn cước công dân= " + identity;
    }
}
