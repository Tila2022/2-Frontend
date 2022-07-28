package What_do;

public class HTML {
    public void html() {
        /** 1. HTML */
        // <!DOCTYPE html>
        // <html lang="en">
        // Todo: Команды HTML
        /** <hr> */ // Линия
        /** <br> */ // Пробел
        /** <p> Текст <p/> */ // Новый абзац
        /** <h1> Заголовок жирным </h1> h2,h3,h4 */ // Заголовок
        /** <form> <input required> </form> */ // Пустое поле
        /** <p> <img src="Адрес картинки" alt="Приписка"> </p> */ // Вставка Фото
        /** <ul> отступ
         *  <ul> <li>Текст</li> </ul> */ // Список с точками
        /** <p> <a href="адрес">Ссылка</a> </p> */ // Ссылка

        // Todo: Редактирование текста
        /** <p><font size="5" color="black" face="Arial"> Текст <font><p> */
        /** <align="center"> align= "" left right center justify */ // Выравнивание
        /** <strong> </strong> */ // Выделение текста Жирным
        /** <u>Текст</u> */ // Подчёркивание
        /** <strike><u>Текст</u></strike> */ // Перечёркивание

        // Todo: Определение
        /** <dl>
         <dt>Язык</dt>
         <dd>Язык — это .....
         </dl> */

        // Todo: Структура сайта
         /**
         <body>
         <div class="header"> </div> Шапка
         <div class="main-content"> </div> Основная часть
         <div class=".Любое название"> </div> Любая часть
         <footer> </footer> Подвал
         <body/> */

        // Todo: Взаимодействие с сайтом
        /** <form> </form> */ // Форма для взаимодействия с сайтом
        /** <form action=""> </form> */ // Заготовка

        // Todo: Поле и Кнопка
        /** <form>
         * <p><input type="text" placeholder="Ввод" size="15"> <input type="text" size="15"> - 2 поле в ряд
         * <input type="submit" value="Отправить"></p>
         * </form>
         * */

        // Todo: Кнопка и Функция
        /**<button id="название ID" onclick="название функции">Ваш запрос</button>
         <script>
         document.getElementById("button").onclick = function start(){
         }
         </script> */


        // Todo: Пример
        /** <center><img src="google.png" width=300 height=100></center>
         * <form action="https://google.com/search" method="get" align="middle"> Запрос Http типа гед google
         *     <input name "q" type="text"/> Это поле ввода / запрос наверх типа q
         *     <input type="submit" value="Search"/> Кнопка и текст
         * </form> */

        // Todo: Поле со списком
        /** Поле со списком <select> </select> */ // Список в 1 поле
        /**<form>
         * <select name="команды">
         * <option value="s1">Красная</option>
         * <option value="s2" selected>Синяя</option>
         * <option value="s3">Зелёная</option>
         * </select>
         * </form> */

        // Todo: Таблица
        /** <table> 1 </table> */ // Для таблицы писать первым
        /** <tr> 2 </tr> */ // Линии писать вторым
        /** <th> 3 </th> */ // Оглавление
        /** <td> 4 </td> */ // Ячейка
        /** style=""; Стиль внутри ячеек
         <table>
             <tr>
                 <th></th>
             </tr>
             <tr>
                 <td></td>
             </tr>
         </table>
         */

        // Todo: WebWorker
        /** <script async> </script> */ // Выполнить перед загрузкой
        /** <script defer> </script> */ // Выполнить после загрузки

        // Todo: Структура сайта (см.Фото)
        /** focus() window open()
         * Navigator - управлять адресацией в браузере.
         * Screen – текущий экран.
         * Location – текущий адрес сайта
         * Frames – список фреймов, которые у вас есть на странице.
         * History - отвечает за обращение к истории.
         * XMLHttpRequest - выполняет асинхронные запросы к серверу */
    }
}