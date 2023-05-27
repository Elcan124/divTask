import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        List<String> strings = Arrays.asList("Java", "SysTem", "Hello", "World", "Lock", "syNchronIzed", "DeadLoCK", "VolATile", "fInal", "test", "DivAcademY", "PaTtern");

        List<Student> studentList = Student.generateFixedStudents();
//listler bu şekilde olacaqdır


    }

    public static List<Integer> findEvenNumbers(List<Integer> list) { //listdəki cüt ededleri  filter istifade ederek tapın
        return list.stream()
                .filter()     //bu hisseni tamamlayın
                .collect(Collectors.toList());
    }

    public static List<Integer> findOddNumbers(List<Integer> list) {//listdəki tək ededleri  filter istifade ederek tapın
        return  //bu hisseni tamamlayın
    }

    public static List<String> findStringsStartingWithS(List<String> list) {//Listdəki 's' və ya 'S' (boyuk kick ferqi yoxdur) ilə başlayan sözləri tapın
        return list.stream()
                .  //bu hisseni tamamlayın
                .collect(Collectors.toList());
    }

    public static Integer findMaxInt(List<Integer> list) { //listdəki en boyuk ededi tapin
        return list.stream()
                .   //bu hisseni tamamlayın
                .orElse(null);
    }

    public static Integer findMinInt(List<Integer> list) { //listdeki en kicik ededi tapın
        return //bu hisseni tamamlayın
    }

    public static Integer findSum(List<Integer> list) { //listdeki ededlerin cemini tapın
        return list.stream()
                .//bu hisseni tamamlayın
    }

    public static Double findAverage(List<Integer> list) { // listdəki bütün ededlerin ortalamasını tapın
        return //bu hisseni tamamlayın
    }

    public static String findLongestString(List<String> list) { //lisdəki en uzun sözü tapın
        return list.stream()
                . // bu hisseni tamamlayin
                .orElse("");
    }

    public static long countStringsWithLetterO(List<String> list) { //listdeki neçe sözdə 'o' hərfi olduğunu tapın
        return list.stream()
                . //bu hisseni tamamlayın
    }

    public static List<Integer> findDistinctElements(List<Integer> list) { // təkrarlanmayan ededleri çıxışa verin (qeyd meselen 1 2 3 4 4 3 3  bele bir list verilibse 1 2 3 4 cixisa verilmelidir)
        return list.stream()
                . //bu hisseni tamamlayın
                .collect(Collectors.toList());
    }


    public static List<Student> findStudentsWithAge(List<Student> students) {  // yaşı 20 olan studentleri tapın
        return students.stream()
                .filter(student ->) // bu hisseni tamamlayin
                .collect(Collectors.toList());
    }

    public static List<Student> findStudentsWithName(List<Student> students) { //adı Ali olan studentleri tapın
        return students.stream()
                .//bu hisseni tamamlayın
                .collect(Collectors.toList());
    }

    public static List<Student> findStudentsWithSurname(List<Student> students) { // soyadı Malikova olan studentleri tapin
        return //bu hisseni tamamlayin
    }

    public static List<Student> findStudentsWithTeacher(List<Student> students) { // muelliminin adı "Muellim 2" olan studentleri tapın
        return students.stream()
                .filter(student ->) // bu hisseni tamamlayin
                .collect(Collectors.toList());
    }

    public static List<Student> findStudentsInRange(List<Student> students) { // yaşları 22 ilə 27 arası olan studentleri tapın
        return   //bu hisseni tamamlayin
    }


    public static List<String> getStudentNames(List<Student> students) {  // bütün studentlerin adlarını yazdırın
        return  //bu hisseni tamamlayin
    }


    public static List<String> getStudentsFullNameWithTeacher(List<Student> students) { // bütün telebelerin adları və soyadlarını + müelliminin adini yazdırın
        return //bu hissei tamamlayin
    }
}




