/** JavaScript */
// Todo : Подключить JS к HTML <script src=""><script >>
// Todo : <script async></script> Выполнить немедленно
// Todo : <script defer></script> После загрузки страницы
/** 1. Вывод */
 let message = "Привет"; // Переменная
 console.log("Привет") // Вывод новой строчки
 alert(message) // Вывод содержимое переменной

/** 2. Переменные (Можно в 1 строку или через запятую) */
// Нельзя объявить с именем  let, class, return и function
 var old = "Dima"; // Старая переменная
 let name = "Dima"; // Текст
 let number = 12345; // Числа

/** Константа */
 // Пишется в шапке
 const name1 = "Dima"; // Текст
 const number1 = 12345; // Числа

/** Удаление */
 a = 10;
 delete a; //true;

 let a = 10;
 delete a; //false

/** 3. Массив */
 let mass = new Array();
 let mass1 = ["Dima","Misha","Petya"];
 mass.unshift("items"); // Добавляет items в начало массива.
 mass.push("items"); // Добавляет items в конец массива.
 mass.shift("items"); //  Удаляет элемент в начале массива и возвращает его.
 mass.pop("items"); // Удаляет элемент в конце массива и возвращает его.


/** 4. Операторы */
/** Оператор typeof */
// Возвращает строку, обозначающую тип операнда.
 num = 10;
 typeof(num); // "number"

 str = "ABC"
 typeof(abc); // "string"

 var b;
 typeof(b) // "undefined"

/** Оператор in */
// Возвращает true, если объект имеет указанное свойство.
 let mass = [1,2,3];
 0 in mass; // true mass[0]==1
 3 in mass; // false mass[3] not exist

 a = new String("10");
 "length" in a; // true

/** Оператор instanceof */
// Для проверки к какому типу принадлежит объек.
 let Day = new Date(1995, 12, 17);

 Day instanceof Date; // true
 Day instanceof Number; // false

/** 5. Блок try,catch,finally */
try {
 // Блок опасного код
} catch (данные) {
 // Блок выполнится при ошибке
} finally {
 // Блок выполнится в любом случае
}

function checkAge(age) {
 try {
  if (age == 0) {
   throw new UserAgeException("Неподходящий возраст.");
  } else if (age == String) {
   throw new UserAgeException("Некорректные данные.");
  } else if (age > 120 || age < 16) {
   throw new UserAgeException("Неподходящий возраст.");
  }
 } catch (age) {
  alert (age.message);
 } finally {
  console.log("Конец")
 }
}
function UserAgeException(message) {
 this.message = message;
}

/** 6. Планирование */
/** Временной интервал страницы */
// Синтаксис (Функция или код, Время 1000 мс = 1 с, Аргументы в функции ...)
 setTimeout() // Вызвать функцию один раз через определённый интервал времени.
 setInterval() // Вызывать функцию регулярно, повторяя вызов через определённый интервал времени.
 clearInterval() // Остановить вызов функции
 // Пример
 //<script >
 let inter;
 let interval = 3000;
 document.getElementById("buttons").onclick = function start(){
 inter = setInterval(addRow, interval);
}
 document.getElementById("buttons").onclick = function stop(){
 clearTimeout(inter);
}
 //</script>

/** История страницы*/
//+-число
history.forward(+-число); // Перемещение вперёд
history.back(); // Перемещение назад

/** Переходы страницы*/
location.assign("https://yandex.ru");  // Переход по ардесу
location = "https://yandex.ru";        // То же
location.replace("https://yandex.ru"); // Переход между адресами скрыт прииивет
location.reload("https://yandex.ru");  // Перезагрузка страницы

/** Диалоговые окна */
function start() { // (Оповещение) Сообщение с 1 кнопкой
 alert("Ошибка");
}
function start() { // (Задать вопрос) Сообщение с 2 кнопками
 if(confirm("Выбирай"))
 alert("Кнопка Да")
else
 alert("Кнопка Нет")
}
function start() { // (Получение данных)  Сообщение с полем ввода
 string = prompt("Напишите выше Имя");
 alert(string);
}

/** Страницы */
window.open("https://yandex.ru", "Yandex"); // Открыть новую страницу
window.close(); // Для закрытия страницы
yandex = window.open("https://yandex.ru", "Yandex"); // Тоже с указателем
window.close(yandex); // Для закрытия по указателю

/** Фреймворки */
<iframe id="iframe" src="https://yandex.ru" style="height:150px; width: 300px"></iframe> // Другие страницы на вашей

<iframe id="iframe" src="" style="height:500px; width:500px;"></iframe>

/** Пойск элементов в HTML */
document.getElementById("myId"); // Пойск по id
let check = document.getElementsByName("choice"); // Пойск по имени
document.getElementsByTagName("p"); // Пойск по тегу p,tr,th,td,table,div ...
document.getElementsByClassName("header"); // Пойск по имени класса
document.getElementsByTagNameNS("button");
document.all; // Обратиться ко всем элементам

// Элементы
document.firstChild // Первый дочерний элемент
document.lastChild // Последний дочерний элемент
document.nextSibling // Перебор дочерних элементов
document.previousSibling // Возвращает предедущие элементы в список

let f = getElementByTag("div");
f.nodeType; // Числовой индетефикатор числового узла
f.nodeValue; // Содержимое узла
f.nodeName; // Наименование тега в верхнем регистре

/** DOM Создание, Добавление , Удаление */
// Создание
let div = document.createElement("div"); // Создаём новый элемент div
let textNode = document.createTextNode("text"); // Создаём новый узел text
// Добавление
document.body.append(div); // Добавляем в DOM-body-div
document.body.insertBefore(div,name); // Добавляем в body-div-name
// Удаление
let i = p.childNodes[1];
document.body.removeChild(div); // Удаляем элемент DOM-body-i

/** Форматирование */
elem.style.width = "300px";
elem.classList
elem.classList.add(greenTextClass);
elem.classList.add(greenTextClass);
elem.classList.toggle(greenTextClass);
elem.classList.toggle(cssClass);

/** Сортировка */
// <script>
document.getElementById("sort").onclick = function sortUl() {
 let list = document.getElementsByTagName("ul")
 let sortList = list.sort();
 list = sortList;
 console.log(list)
}
// </script>