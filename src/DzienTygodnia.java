
public class DzienTygodnia {
    public int numer;

    DzienTygodnia(int numer)
    {
        this.numer=numer;
    }

    public String zwroc()
    {
        switch (this.numer) {
            case 1:
                return "poniedziałek";
            case 2:
                return "wtorek";

            case 3:
                return "środa";

            case 4:
                return "czwartek";

            case 5:
                return "piątek";

            case 6:
                return "sobota";

            case 7:
                return "niedziela";
            default:
                return "Zły dzień tygodnia robaczku!";
        }

    }
}
