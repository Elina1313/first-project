public class Praktikum {

	public static void main(String[] args) {
		double[] expenses = {1.3, 1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        findMaxExpense(expenses);
		double maxExpense = findMaxExpense(expenses);
       // Вызовите метод и присвойте maxExpense значение его результата
        
		System.out.println("Самая большая трата недели " + maxExpense);
     
	}
	
	public static double findMaxExpense(double[] expenses) { 
    // Объявите метод findMaxExpense
    // Реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
    // Самую большую трату запишите в переменную maxExpense
   
    
        double maxExpense=0;
        for (int i=0; i<expenses.length; i++) {
            if (expenses[i] > maxExpense){
                maxExpense = expenses[i];
            }
        } 
        return maxExpense;
    }
}

