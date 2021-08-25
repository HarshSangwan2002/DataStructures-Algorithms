import java.util.*;

public class write_priorityqueue {

    public static class PriorityQueue<T> {
        ArrayList<T> data;
        Comparator comp;

        public PriorityQueue() {
            data = new ArrayList<>();
            comp = null;
        }

        public PriorityQueue(Comparator comp) {

            data = new ArrayList<>();
            comp = this.comp;
        }

        public void add(T val) {
            // write your code here

            data.add(val);

            upheapify(data.size() - 1);

        }

        private boolean isSmaller(int i, int j) {

            if (comp == null) {

                Comparable ith = (Comparable) data.get(i);
                Comparable jth = (Comparable) data.get(j);
                if (ith.compareTo(jth) < 0) {
                    return true;
                }

                else
                    return false;
            }

            else {

                T ith = data.get(i);
                T jth = data.get(j);

                if (comp.compare(ith, jth) < 0) {
                    return true;
                }

                else
                    return false;
            }
        }

        private void upheapify(int i) {

            if (i == 0)
                return;

            int pi = (i - 1) / 2;

            if (isSmaller(i, pi)) {
                swap(i, pi);
                upheapify(pi);
            }
        }

        private void swap(int a, int b) {

            T ith = data.get(a);
            T jth = data.get(b);
            data.set(a, jth);
            data.set(b, ith);
        }

        public T remove() {
            // write your code here

            if (data.size() == 0) {
                System.out.println("Underflow");
                return null;
            }

            else {
                swap(0, data.size() - 1);
                T val = data.remove(data.size() - 1);
                downheapify(0);
                return val;
            }
        }

        private void downheapify(int pi) {

            int mini = pi;

            int li = 2 * pi + 1;

            if (li < data.size() && isSmaller(li, mini))
                mini = li;

            int ri = 2 * pi + 2;
            if (ri < data.size() && isSmaller(ri, mini))
                mini = ri;

            if (mini != pi) {
                swap(pi, mini);
                downheapify(mini);
            }
        }

        public T peek() {
            // write your code here

            if (data.size() == 0) {
                System.out.println("Underflow");
                return null;
            }

            else {
                return data.get(0);
            }
        }

        public int size() {
            // write your code here

            return data.size();
        }
    }

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

    static class StudentWt implements Comparator<Student> {

        public int compare(Student s1, Student s2) {

            return s1.wt - s2.wt;
        }
    }

    static class StudentHt implements Comparator<Student> {

        public int compare(Student s1, Student s2) {

            return s1.ht - s2.ht;
        }
    }

    public static void main(String[] args) {

        // int[] arr = { 10, 2, 17, 3, 18, 9, 22 };

        PriorityQueue<Student> pq = new PriorityQueue<>();

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