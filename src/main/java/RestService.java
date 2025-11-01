public class RestService {
    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (threshold >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев
                threshold = (threshold - expenses) / 3; /// "то за месяц его деньги уменьшаются на expense, а затем остаток накоплений ещё уменьшается в три раза — траты на отдых"           } else {
                threshold = threshold + income;
            }
        }
        return count;
    }
}
