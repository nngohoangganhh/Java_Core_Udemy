package chapter11.lap9;

import java.util.Objects;

public class Member implements Comparable<Member>{
    private int id;
    private String name;
    private int age;

    public Member(int id,String name,int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Member huhu) {
        if (this.age != huhu.age) {
            return this.age - huhu.age; // tuổi tăng dần
        }
        return this.name.compareToIgnoreCase(huhu.name); // tên A-Z
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
