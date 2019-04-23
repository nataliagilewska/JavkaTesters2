public class LiczbaPierwsza {
    int liczba;

    LiczbaPierwsza(int liczba) {
        this.liczba = liczba;
    }

    public boolean sprawdz()
    {
        boolean result=false;

        for (int i = 0; i < liczba; i++) //
        {
            result = true;
            if (i < 2) {
                result = false;
            } else
                if (liczba % i == 0) {
                    result = false;
                    break;
                }
            }


        return result;
    }
}