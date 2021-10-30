public class MonthUtils {

    public static final IMonth[] MONTHS = {  //Класс Month сделать неизменяемым (immutable)

            new MonthImpl("Ja", 31, 21),
            new MonthImpl("Fe", 28, 19)
    };
}
