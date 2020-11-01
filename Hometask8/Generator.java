package Hometask8;


import java.util.Collection;
import java.util.Random;
import java.util.function.Supplier;

public class Generator {

    private static final String[] names = ("Август Авраам Адам Адриан Айдар Аким Алан Алихан " +
            "Альберт Антип Амур Амир Аристарх Арай Арман Арсеn Арсений Артур Архип Аскольд" +
            " Богдан Борислав Бруно Булат Вальтер Вахтанг Вениамин Венцеслав Винсент Вилльям Влас" +
            " Всеволод Гавриил Генри Гарри Геракл Герман Глеб Гордей").split(" ");

    private static final String[] surnames = ("Аврорин Аверин Агатов Адмиралов Александров Амурский" +
            " Ангельский Анненский Апраскин Арбатов Аренский Арский Аристов Арбенин Астров" +
            " Ахматов Афинский Багиров Барон Бакурин Бартелеманов Балановский Белинский Белоградский" +
            " Бельский Березов Беркутов Бестужев Богословский Богатырев Болконский Борисоглебский" +
            " Булгаков Вавилов Ваганков Васнецов Валевский Варламов").split(" ");

    private static final String[] patronymics = ("Алексеевич Анатольевич Андреевич Антонович Аркадьевич" +
            " Артемович Бедросович Богданович Борисович Валентинович Валерьевич Васильевич Викторович " +
            "Витальевич Владимирович Владиславович Вольфович Вячеславович Геннадиевич Георгиевич Григорьевич " +
            "Данилович Денисович Дмитриевич Евгеньевич").split(" ");

    private static final Random random = new Random();

    public static Student makeStudent(){
        return new Student(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                patronymics[random.nextInt(patronymics.length)], random.nextInt(11) );
    }
    public static <T> void generate(Collection<T> collection, Supplier<T> supplier, int count){
        for (int i = 0; i < count; i++){
            collection.add(supplier.get());
        }
    }
}
