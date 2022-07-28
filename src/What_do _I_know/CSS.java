package What_do;

public class CSS {
    public static void css() {
        /** 2. CSS*/
        // Todo : Вставить CSS в HTML
        /** <head> Если HTML и CSS в одной папке то просто название файла
         <link href="style.css" rel="style.css" type="text/css">
         </head> */

        // Todo : ПРИМЕР как писать в CSS
        //  table {
        //  border-collapse: collapse;
        //  border: 1px solid grey;
        //  } или прямо в файле HTML пример снизу


        // Todo: Cтиль сайта
        /**
         <head>
         <style>

         header {
         ОФОРМЛЕНИЯ ШРИФТА
         font-style:; Начертание шрифта
         Обычный| Курсив |Наклонение| Наследует у родителя
         normal | italic | oblique | inherit

         ОФОРМЛЕНИЕ ТЕКСТА
         text-decoration:; - Оформление текста
         мигающий || перечеркнутый|| над текстом || подчеркнутый | Отменяет | Наследуется у родителя
         blink || line-through || overline || underline | none | inherit

         ШРИФТ, ЦВЕТ, ФОН, ВЫРАВНИЕ, ОТСТУП
         font-family:; - Шрифт
         font-size: 10px; - Размер шрифта
         font-weight:bold; - Выделение жирным
         color:; - Цвет текста
         background:; - Цвет фона
         text-align:; - Выравнивание текста left right center justify
         margin: auto; - Выравнивание таблицы left right center justify
         margin-top: 15px; Отступ сверху
         margin-bottom: 15px;  Отступ снизу

         СЕЛЕКТОРЫ ПСЕВДОКЛАССА
         Элемент: link {color: ;} - Меняет цвет ссылки
         Элемент: hover {color: ;} - Меняет цвет при наведении курсора мыши
         Элемент: focus {color: ;} - Меняет цвет при установке курсора в поле ввода
         Элемент: active {color: ;} - Меняет цвет при нажатии
         Элемент: visited {color: ;} - Меняет цвет после перехода

         ТАБЛИЦА
         height: px; - Высота таблицы
         width: px; - Ширина блока таблицы
         padding: px; - Толщина таблицы
         border: 1px solid black; - Толщина и цвет внешней границы
         table - для внешнего контура
         tr,th,td - для внутреннего
         border-spacing: px px; - Размер границ таблицы

         </style>
         </head> */

        // Todo: Селекторы
        /** 1) Селекторы .Glava доступ к дополнительным
         2) Дочерние селекторы  li>b доступ к дочерним
         3) Селекторы атрибутов [type="number"] или [type="http://..."] для отдельных элементов
         4) Универсальные селекторы
         * для всей страницы
         div p * для доступа ко всем после p / div-p- и т.д.
         4) Группировка селекторов h1,h2,p */

        // Todo: Каскадирование
        /** Каскадирование стилей
         1) Если для 1 элемента определено несколько стилей выбирается последний
         2) Если для 1 элемента определено несколько стилей с разными параметрами они объединяются в 1

         Система приоритетов
         p {color:red;} - 1 балл
         .Text{color:blue} - 10 баллов
         #index{color:green;} - 100 баллов
         <p style="color:black"></p> - 1000 баллов
         Приписка !important; - Самый высокий балл
         */

        // Todo: FlexBox
        /** justify-content: ; flex-start/center/flex-end // space-between // space-around
         * flex-grow: ; 0 1 5 */
    }
}