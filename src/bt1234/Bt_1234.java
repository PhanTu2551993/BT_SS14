package bt1234;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bt_1234 {

    //          BT1
        public static void main(String[] args) {
            List<Integer> numbers = Stream.generate(() -> new Random().nextInt(1000) + 1)
                    .limit(100)
                    .collect(Collectors.toList());
            Integer maxNumber = numbers.stream()
                    .max(Integer::compareTo)
                    .orElseThrow(() -> new RuntimeException("Danh sách rỗng!"));
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);


        //          BT2
            List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Các số chẵn từ danh sách là: " + evenNumbers);

        //         BT3
            List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
            // tạo một danh sách không thay đổi chứa một phần tử, và phần tử này là tổng của tất cả các số
            List<Integer> sums = List.of(number.stream()
                    .reduce(0, Integer::sum));

            System.out.println("Tổng của các số trong danh sách là: " + sums);


        //          Bt4

            List<String> strings = Arrays.asList("banana", "apple", "orange", "grape", "kiwi");

            // Sử dụng Stream API và phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái
                    List<String> sortedStrings = strings.stream()
                                .sorted()
                                .toList();
                     System.out.println("Danh sách sau khi sắp xếp: " + sortedStrings);

}}
