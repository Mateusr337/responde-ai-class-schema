package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String password;
    private Signature signature = new Signature();
    private List<Course> finishedCourses = new ArrayList<>();
}
