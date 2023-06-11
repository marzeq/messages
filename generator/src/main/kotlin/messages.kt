import io.github.wulkanowy.messages.pojo.*

val messages = listOf(
    Message(
        id = 37,
        title = "Problemy na Gdańskim Portalu Edukacyjnym",
        content = "Otrzymujemy zgłoszenia dotyczące problemów z logowaniem i odświeżaniem danych w Wulkanowym u użytkowników GPE. To nie jest błąd po stronie Wulkanowego i nic z tym nie możemy zrobić. Problem należy zgłaszać do administracji GPE",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 36,
        title = "Planowane przerwy techniczne dziennika UONET+",
        content = "VULCAN planuje w najbliższych dniach przerwy techniczne w godzinach 22:00 – 06:00. Przeczytasz o nich więcej na stronie VULCANa klikając tutaj",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.vulcan.edu.pl/aktualnosci/planowana-przerwa-techniczna-w-e-dzienniku-uonet-529",
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 35,
        title = "Przerwa techniczna systemu UONET+",
        content = "Tak, zgadza się. Trzeci dzień z rzędu dziennik nie działa. To awaria całego systemu UONET+, a nie naszej apki. Nic na to nie poradzimy, trzeba czekać na reakcję VULCANa",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 34,
        title = "Witaj w najnowszej wersji Wulkanowego",
        content = "Jeśli Cię to interesuje, to po kliknięciu tutaj znajdziesz opis zmian w tej aktualizacji. Jeśli nie chcesz tego widzieć kliknij OK",
        priority = MessagePriority.LOW,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/646383727504399",
        versionMin = 125,
        isDismissible = true,
        isVisible = false,
    ),
    Message(
        id = 33,
        title = "Dostępna aktualizacja",
        content = "Na wersji, której używasz mogą występować problemy. Zaktualizuj Wulkanowego do najnowszej wersji",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetFlavor = AppFlavor.HMS,
        destinationUrl = "https://appgallery.huawei.com/#/app/C101440411",
        versionMax = 129,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 32,
        title = "Dostępna aktualizacja",
        content = "Na wersji, której używasz mogą występować problemy. Zaktualizuj Wulkanowego do najnowszej wersji",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetFlavor = AppFlavor.PLAY,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        versionMax = 129,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 31,
        title = "W imieniu poniżej wyświetlają się gwiazdki i w apce pokazują się błędy?",
        content = "Jeśli tak, to kliknij tutaj po instrukcję naprawy tego problemu. Jeśli nie - zignoruj ten komunikat",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/643278101148295",
        versionMax = 123,
        versionMin = 122,
        isDismissible = true,
        isVisible = false,
    ),
    Message(
        id = 30,
        title = "Witaj w nowej wersji Wulkanowego!",
        content = "Dużo się ostatnio działo :) Jeśli masz jakieś problemy z aktualną wersją - kliknij tutaj i weź udział w dyskusji pod naszym postem na Facebooku",
        priority = MessagePriority.LOW,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/643228434486595",
        versionMin = 122,
        isDismissible = true,
        isVisible = false,
    ),
    Message(
        id = 29,
        title = "UWAGA",
        content = "Z powodu aktualizacji systemu UONET+ przestało w Wulkanowym działać odświeanie większości danych (wiadomości jednak ciągle powinny działać). Aktualizacja naprawiająca ten problem pojawi się w okolicach niedzieli i poniedziałku",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.EDU_LUBLIN.url,
        destinationUrl = "https://twitter.com/wulkanowy/status/1654404443264122882",
        versionMax = 122,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 28,
        title = "UWAGA",
        content = "Z powodu aktualizacji systemu UONET+ przestało w Wulkanowym działać odświeanie większości danych (wiadomości jednak ciągle powinny działać). Aktualizacja naprawiająca ten problem pojawi się w okolicach niedzieli i poniedziałku",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        destinationUrl = "https://twitter.com/wulkanowy/status/1654404443264122882",
        versionMax = 122,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 27,
        title = "UWAGA",
        content = "System UONET+ ma obecnie problemy techniczne. W tym czasie może wyświetlać się komunikat o trwającej przerwie technicznej. Prosimy o cierpliwość i spróbowanie ponownie później",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 26,
        title = "UWAGA",
        content = "W związku z problemami technicznymi po stronie systemu UONET+ dostęp do dziennika może być w najbliższym czasie utrudniony lub nawet niemożliwy. Prosimy o cierpliwość i spróbowanie ponownie później",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 25,
        title = "Wesołych Świąt!",
        content = "Wesołych, spokojnych Świąt Bożego Narodzenia oraz szczęśliwego, bezawaryjnego Nowego Roku życzy Wulkanowy zespół! 🎄",
        priority = MessagePriority.LOW,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/552841720191934",
        isDismissible = true,
        isVisible = false,
    ),
    Message(
        id = 24,
        title = "UWAGA",
        content = "Aktualizacja naprawiająca obsługę systemu Resman powinna być już dostępna. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.RESMAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/546997824109657",
        versionMax = 116,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 23,
        title = "UWAGA. Kolejna awaria systemu UONET+",
        content = "VULCAN ma drugi dzień z rzędu problemy techniczne. Zachowaj spokój i spróbuj ponownie później. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/537177675091672",
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 22,
        title = "UWAGA. Informacja o przyczynie problemów z odświeżaniem danych",
        content = "VULCAN ma teraz problemy techniczne. Jako twórcy Wulkanowego nie mamy na to żadnego wpływu. Zachowaj spokój i spróbuj ponownie później. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/536251861850920",
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 21,
        title = "Ważna informacja dotycząca wiadomości",
        content = "Na zainstalowanej wersji Wulkanowego mogą występować problemy z wiadomościami. Kliknij w kafelek, by dowiedzieć się więcej",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/534950415314398",
        versionMax = 115,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 20,
        title = "Informacje o wydaniu wersji 1.8.1",
        content = "Dziękujemy za aktualizację Wulkanowego! Kliknij w kafelek, żeby przeczytać o nowościach w tej wersji",
        priority = MessagePriority.LOW,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/525359099606863",
        versionMin = 116,
        isDismissible = true,
        isVisible = false,
    ),
    Message(
        id = 19,
        title = "Obserwujemy problemy z dostępem do systemu UONET+",
        content = "To nie są problemy po stronie naszej aplikacji a po stronie serwerów VULCANa. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/524562059686567",
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 18,
        title = "Problemy techniczne z systemem UONET+",
        content = "Obserwujemy problemy z dostępem do dziennika UONET+. To NIE JEST błąd po stronie aplikacji tylko po stronie serwerów VULCANa. Spróbuj ponownie później",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 17,
        title = "Awaria systemu UONET+",
        content = "Obserwujemy problemy z dostępem do dziennika UONET+. To NIE JEST błąd po stronie aplikacji tylko po stronie serwerów VULCANa. Spróbuj ponownie później",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 16,
        title = "Ważna informacja dotycząca wiadomości",
        content = "Na zainstalowanej wersji Wulkanowego mogą występować problemy z wiadomościami. Kliknij w kafelek, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/459115399564567",
        versionMin = 108,
        versionMax = 111,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 15,
        title = "Ważna informacja dotycząca wiadomości",
        content = "Zastanawiasz się, gdzie podziały się starsze wiadomości? Kliknij, żeby przeczytać więcej na ten temat na naszym fanpage'u na Facebooku",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/453319193477521",
        versionMin = 108,
        isDismissible = true,
        isVisible = false,
    ),
    Message(
        id = 14,
        title = "Dostepna aktualizacja",
        content = "W sklepie Play powinna być już dostępna aktualizacja, która przywraca podstawowe funkcjonalności modułu wiadomości. Kliknij, aby przejść do sklepu Play",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.PLAY,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        versionMax = 107,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 13,
        title = "Dostepna aktualizacja",
        content = "W sklepie AppGallery powinna być już dostępna aktualizacja, która przywraca podstawowe funkcjonalności modułu wiadomości. Kliknij, aby przejść do sklepu AppGallery",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.HMS,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://appgallery.huawei.com/#/app/C101440411",
        versionMax = 107,
        isDismissible = false,
        isVisible = true,
    ),
    Message(
        id = 12,
        title = "Problemy z wiadomościami",
        content = "W ostatniej aktualizacji systemu UONET+ firma VULCAN gruntownie zmieniła moduł wiadomości, co w konsekwencji zepsuło obsługę wiadomości w Wulkanowym. Pracujemy nad naprawą",
        priority = MessagePriority.HIGH,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/450349017107872",
        versionMax = 108,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 11,
        title = "Problemy z odświeżaniem danych i logowaniem",
        content = "Ostatnia aktualizacja systemu VULCAN UONET+ zepsuła w Wulkanowym logowanie do dziennika i odświeżanie danych. Pracujemy nad poprawką, ale nie wiemy kiedy uda nam się ją przygotować. Do tego czasu prosimy o cierpliwość",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 10,
        title = "Przerwa techniczna",
        content = "Aktualnie trwają prace konserwacyjne. Nie mamy pojęcia kiedy się zakończą. Prosimy o zachowanie cierpliwości i sprawdzenie dziennika ponownie za jakiś czas",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 9,
        title = "Błędy we frekwencji",
        content = "Przez ostatnią aktualizację systemu UONET+ we frekwencji brakuje informacji o przedmiotach. To nie błąd aplikacji - czekamy na rozwiązanie problemu przez firmę VULCAN.\nPS. Wulkanowy nie należy do firmy VULCAN",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        isVisible = false,
    ),
    Message(
        id = 8,
        title = "Błędy we frekwencji",
        content = "W szczegółach frekwencji mogą występować błędy przy ładowaniu danych. Problem spowodowany jest ostatnią aktualizacją systemu UONET+. Poprawka jest juz dostępna w sklepie AppGallery",
        destinationUrl = "https://appgallery.huawei.com/app/C101440411",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.HMS,
        type = MessageType.DASHBOARD_MESSAGE,
        versionMax = 107,
        isVisible = true,
    ),
    Message(
        id = 7,
        title = "Błędy we frekwencji",
        content = "W szczegółach frekwencji mogą występować błędy przy ładowaniu danych. Problem spowodowany jest ostatnią aktualizacją systemu UONET+. Poprawka jest juz dostępna w sklepie Play",
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.PLAY,
        type = MessageType.DASHBOARD_MESSAGE,
        versionMax = 107,
        isVisible = true,
    ),
    Message(
        id = 6,
        title = "Problemy z platformą Resman Rzeszów",
        content = "Informujemy o problemach z połączeniem z dziennikiem. Do czasu jego rozwiązania Wulkanowy może wyświetlać mylące komunikaty informujące o wystąpieniu błędu i zalecające sprawdzenie poprawności daty na urządzeniu, mimo że to nie ona stanowi problem. Należy poczekać na rozwiązanie problemu przez administratorów dziennika",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.RESMAN.url,
        type = MessageType.DASHBOARD_MESSAGE,
        isDismissible = false,
        isVisible = false,
    ),
    Message(
        id = 5,
        title = "Wesołych Świąt!",
        content = "Wesołych, spokojnych świąt oraz szczęśliwego, bezawaryjnego Nowego Roku życzy zespół Wulkanowego! 🎄",
        priority = MessagePriority.LOW,
        type = MessageType.DASHBOARD_MESSAGE,
        versionMin = 102,
        isDismissible = true,
        isVisible = false,
    ),
    Message(
        id = 4,
        title = "Problemy z logowaniem",
        content = "Przez aktualizację dziennika Gdańskiej Platformy Edukacyjnej przestało działać logowanie w Wulkanowym. Przez to przy odświeżaniu danych pokazuje się komunikat o nieznanym błędzie dziennika. W sklepie AppGallery dostępna jest aktualizacja",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://appgallery.huawei.com/app/C101440411",
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        type = MessageType.DASHBOARD_MESSAGE,
        targetFlavor = AppFlavor.HMS,
        versionMax = 101,
        isVisible = true,
    ),
    Message(
        id = 3,
        title = "Problemy z logowaniem",
        content = "Przez aktualizację dziennika Gdańskiej Platformy Edukacyjnej przestało działać logowanie w Wulkanowym. Przez to przy odświeżaniu danych pokazuje się komunikat o nieznanym błędzie dziennika. W sklepie Google Play dostępna jest aktualizacja",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        type = MessageType.DASHBOARD_MESSAGE,
        targetFlavor = AppFlavor.PLAY,
        versionMax = 101,
        isVisible = true,
    ),
    Message(
        id = 2,
        title = "Problemy z aplikacją",
        content = "Występują problemy z dostępem do systemu UONET+, które są spowodowane ostatnimi aktualizacjami po stronie VULCANa. Nie jest to winą Wulkanowego. Prosimy o cierpliwość do czasu aż VULCAN rozwiąże problem po swojej stronie",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        isVisible = false,
    ),
    Message(
        id = 1,
        title = "Polityka prywatności",
        content = "Zaktualizowaliśmy politykę prywatności. Kliknij aby zobaczyć więcej",
        priority = MessagePriority.LOW,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://wulkanowy.github.io/polityka-prywatnosci",
        isDismissible = true,
        isVisible = false,
    )
)
