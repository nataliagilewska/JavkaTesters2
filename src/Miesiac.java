public class Miesiac {
    public String miesiac;

    Miesiac(String miesiac)
    {
        this.miesiac=miesiac;
    }

    public String zwrocPoreRoku()
    {
        switch(this.miesiac)
        {
            case "styczen":
                case"luty":
                return "Jest zima";
            case "marzec":
                return "Jest zima lub wiosna";
            case "kwiecien"+"maj":
                return "Jest wiosna";
            case "czerwiec":
                return "Jest wiosna lub lato";
            case "lipiec"+"sierpien":
                return "Jest lato";
            case "wrzesien":
                return "Jest lato lub jesien";
            case "padziernik"+"listopad":
                return "Jest jesien";
            case "grudzien":
            return "Jest jesien lub zima";

            default:
                return "Zle literki";
        }
    }
}
