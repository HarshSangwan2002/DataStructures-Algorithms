import java.util.*;

public class comparable_comp {

    public static class Student implements Comparable<Student> {

        int rno;
        int ht;
        int wt;

        Student(int rno, int ht, int wt) {

            this.rno = rno;
            this.ht = ht;
            this.wt = wt;
        }

        /*
         * Comparable par = (Comparable) data.get(pi); Comparable child = (Comparable)
         * data.get(i);
         * 
         * if(child.compareTo(par)<0) { swap(pi,i); upheapify(pi); }
         */
        public int compareTo(Student o) {

            return this.rno - o.rno;
        }

        public String toString() {

            return "Roll No: " + this.rno + " Height: " + this.ht + " Weight: " + this.wt;
        }
    }

    static class StudentHt implements Comparator<Student> {

        public int compare(Student s1, Student s2) {

            return s1.ht - s2.ht;
        }
    }

    public static void main(String[] args) {

        // int[] arr = { 10, 2, 17, 3, 18, 9, 22 };

        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentHt());

        pq.add(new Student(10, 180, 81));
        pq.add(new Student(2, 185, 85));
        pq.add(new Student(12, 170, 84));
        pq.add(new Student(18, 179, 88));
        pq.add(new Student(7, 182, 82));

        while (pq.size() != 0) {
            System.out.println(pq.remove());
        }
    }
}