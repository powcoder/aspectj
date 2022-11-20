

public privileged aspect GradeAspect {

    pointcut monitoringGetLetterGrade (Grade g): execution(String Grade.getLetterGrade()) && this(g);

    String around(Grade g): monitoringGetLetterGrade(g) {

        if (g.grade < 0 || g.grade > 100)
//            return "INVALID";

        return proceed(g);
        else {
            return proceed(g);
        }
    }

    public String Grade.GetLetterOnly() {

        String res = getLetterGrade();

        if (res.endsWith("+") || res.endsWith("-")) {

            res = res.substring(0, res.length() - 1);
        }

        return res;
    }
}
