public class program {
    public static void main(String[] args) {
        int startNum = 2;
        int finishNum = 22;

        int[][] routes = methods.createRoutes(startNum, finishNum);
        methods.show2dArray(routes);

        int numberRoutes = methods.getNumberRoutes(routes);

        System.out.printf("Количество возможных способов получить из числа %d число %d,\n", startNum, finishNum);
        System.out.printf("используя операции прибавления 1 и умножение на 2 равно %d", numberRoutes);
    }

}