import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 요리 제목 입력
        System.out.print("내가 좋아하는 요리 제목을 입력하세요: ");
        String recipeTitle = scanner.nextLine();

        // 요리 별점 입력
        System.out.print("요리 별점을 1~5 사이의 소수점이 있는 실수로 입력하세요: ");
        double rating = scanner.nextDouble();
        scanner.nextLine();

        // 요리 레시피 입력
        List<String> recipeSteps = new ArrayList<>();
        System.out.println("내가 좋아하는 요리 레시피를 한 문장씩 10문장 입력하세요:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 문장: ");
            String step = scanner.nextLine();
            recipeSteps.add(step);
        }

        // 출력
        System.out.println("\n[ " + recipeTitle + " ]");
        int integerRating = (int) rating;
        double percentageRating = (rating / 5.0) * 100;

        System.out.printf("별점 : %d (%.1f%%)\n", integerRating, percentageRating);
        for (int i = 0; i < recipeSteps.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, recipeSteps.get(i));
        }

        scanner.close();
    }
}