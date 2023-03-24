package assignment5;

import java.util.HashMap;

public class FlyWeight {

    public static void main(String[] args) {
        Sirius sirius = new Sirius();
       
        Projects day1 = sirius.getProject("Project1");
        day1.implement();

        Projects day2 = sirius.getProject("Project1");
        day2.implement();

        Projects day3 = sirius.getProject("Project2");
        day3.implement();

        Projects day4 = sirius.getProject("Project2");
        day4.implement();
    }
}

interface Projects {
    void implement();
}

class Project1 implements Projects {
    private String language;

    public Project1(String language) {
        this.language = language;
        System.out.println("Project1 initializing " + language);
    }

    public void implement() { 
        System.out.println("Project1 implementation " + language);                           
                                                                                            
    }                                                                                       
}                                                                                           

class Project2 implements Projects {                                                                
    private String language;                                                                   

    public Project2(String language) {
        this.language = language;
        System.out.println("Project2 initializing " + language);
    }

    public void implement() {
        System.out.println("Project2 implementation " + language);
    }
}

class Sirius {
    private static final HashMap<String, Projects> flyweight = new HashMap<>();

    public Projects getProject(String projectType) {
        Projects pro = flyweight.get(projectType);

        if (pro == null) {
            if (projectType.equals("Project1")) {
                pro = new Project1("java");
            } 
            else if (projectType.equals("Project2")) {
                pro = new Project2("python");
            }

            flyweight.put(projectType, pro);
        }

        return pro;
    }
}
