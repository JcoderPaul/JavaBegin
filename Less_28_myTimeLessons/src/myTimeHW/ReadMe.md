1. Создать объект LocalDataTime, представляющий собой дату 25.06.2020 19:47.
   Используя этот объект, создать другой объект LocalDataTime, представляющий
   собой дату через 3 - и месяца после заданного. Вывести на консоль
   содержащиеся в нем объекты LocalTime и LocalData.
   - Реализация задачи: [TimeHW_1.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_1.java)
   - Применяемые классы и интерфейсы: [LocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateTime.txt)
   - Применяемые методы: 
     - static LocalDateTime of (int year, int month, int dayOfMonth, int hour, int minute) - Получает экземпляр LocalDateTime из года, месяца,
       дня, часа и минуты, устанавливая секунды и наносекунды равными нулю.
     - LocalDate toLocalDate () - Получает часть LocalDate этой даты и времени.
     - LocalDateTime plusMonths(long months) - Возвращает копию вызывающего объекта LocalDateTime
       с указанным количеством добавленных месяцев.
     - LocalTime toLocalTime () - Получает часть вызывающего LocalTime объекта даты и времени.

2. Создать объект LocalDataTime, представляющий собой сегодняшнюю дату.
   Преобразовать дату в строку вида 05.05.2017. Вывести полученное на
   консоль.
   - Реализация задачи: [TimeHW_2.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_2.java)
   - Применяемые классы и интерфейсы: [LocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateTime.txt), [DateTimeFormatter](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)
   - Применяемые методы:
     - static LocalDateTime now () - Получает текущую дату и время по системным
       часам в часовом поясе по умолчанию.
     - static DateTimeFormatter	ofPattern (String pattern) - Создает средство 
       форматирования с использованием указанного шаблона.
     - String format (DateTimeFormatter formatter) - Форматирует дату-время, 
       используя указанный модуль форматирования.
3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime,
   представляющий собой дату, полученную из этой строки.
    - Реализация задачи: [TimeHW_3.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_3.java)
    - Применяемые классы и интерфейсы: [LocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateTime.txt), [DateTimeFormatter](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)
    - Применяемые методы:
        - static DateTimeFormatter ofPattern (String pattern) - Создает средство
          форматирования с использованием указанного шаблона.
        - static LocalDateTime parse (CharSequence text, DateTimeFormatter formatter) - Получает экземпляр
          LocalDateTime из текстовой строки, используя определенный модуль форматирования.
4. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime,
   представляющий собой дату, полученную из этой строки. Далее
   преобразовать его в объект типа Instant, указав тайм зону
   "America/Chicago". Вывести количество прошедших миллисекунд.
    - Реализация задачи: [TimeHW_4.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_4.java)
    - Применяемые классы и интерфейсы: [LocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateTime.txt), [DateTimeFormatter](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html), [Instant](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassInstant.txt), [ZoneId](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ZoneIdClass.txt), [ChronoLocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ChronoLocalDateTime.txt), [ZoneRules](https://docs.oracle.com/javase/8/docs/api/java/time/zone/ZoneRules.html), [ZoneOffset](https://docs.oracle.com/javase/8/docs/api/java/time/ZoneOffset.html)
    - Применяемые методы:
        - static DateTimeFormatter ofPattern (String pattern) - Создает средство
          форматирования с использованием указанного шаблона.
        - static LocalDateTime parse (CharSequence text, DateTimeFormatter formatter) - Получает экземпляр
          LocalDateTime из текстовой строки, используя определенный модуль форматирования.
        - default Instant toInstant (ZoneOffset offset) - Преобразует дату-время в Instant.
        - static ZoneId	of (String zoneId) - Получает экземпляр ZoneId из идентификатора,
          гарантируя, что идентификатор действителен и доступен для использования.
        - abstract ZoneRules getRules () - Получает правила часового пояса для этого идентификатора,
          позволяющие выполнять вычисления.
        - ZoneOffset getOffset (LocalDateTime localDateTime) - Получает подходящее смещение для указанной 
          локальной даты и времени в этих правилах.
        - long toEpochMilli () - Преобразует этот момент в количество миллисекунд
          эпохи 1970-01-01T00:00:00Z.
5. Создать объект LocalDataTime, представляющий собой сегодняшнюю дату.
   Создать объект LocalDataTime, представляющий собой дату 07.07.2018.
   Используя созданные объекты, найти количество дней между этими двумя
   датами.
    - Реализация задачи: [TimeHW_5.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_5.java)
    - Применяемые классы и интерфейсы: [LocalDate](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateClass.txt), [Period](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassPeriod.txt), [ChronoUnit](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ChronoUnitEnum.txt)
    - Применяемые методы:
      - static LocalDate now () - Получает текущую дату по системным
        часам в часовом поясе по умолчанию.
      - static LocalDate of (int year, int month, int dayOfMonth) -
        Получает экземпляр LocalDate из года, месяца и дня.
      - static Period between (LocalDate startDateInclusive, LocalDate endDateExclusive) -
        Получает Period, состоящий из количества лет, месяцев и дней между двумя датами.
      - int getDays () - Получает количество дней этого периода.
      - int getMonths () - Получает количество месяцев этого периода.
      - int getYears () - Получает количество лет этого периода.
      - long between (Temporal temporal1Inclusive, Temporal temporal2Exclusive) - Вычисляет
        количество времени между двумя темпоральными объектами.
6. Даны объект LocalDataTime, представляющий собой сегодняшнюю дату и
   объект LocalDataTime, представляющий собой дату 07.07.2018.
   Подсчитать количество секунд между полуночью первой даты и полуночью
   второй даты.
    - Реализация задачи: [TimeHW_6.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_6.java)
    - Применяемые классы и интерфейсы: [LocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateTime.txt), [Duration](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassDuration.txt), [LocalDate](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateClass.txt)
    - Применяемые методы:
        - static LocalDate now () - Получает текущую дату по системным
          часам в часовом поясе по умолчанию.
        - static LocalDate of (int year, int month, int dayOfMonth) -
          Получает экземпляр LocalDate из года, месяца и дня.
        - LocalDateTime atStartOfDay () - Объединяет эту дату со временем полуночи,
          чтобы создать LocalDateTime в начале этой даты.
        - static Duration between (Temporal startInclusive, Temporal endExclusive) -
          Получает Duration, представляющую продолжительность между двумя временными
          объектами.
        - long getSeconds () - Получает количество секунд в этой длительности.
7. Создать объект Instant. Вывести его на консоль. Затем создать объект
   ZoneDateTime на основании предыдущего объекта с тайм зоной "Africa/Cairo".
    - Реализация задачи: [TimeHW_7.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_7.java)
    - Применяемые классы и интерфейсы: [Instant](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassInstant.txt), [ZoneId](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ZoneIdClass.txt), [ZonedDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ZonedDateTime.txt)
    - Применяемые методы:
       - static Instant now () - Получает текущий момент от системных часов.
       - ZonedDateTime atZone (ZoneId zone) - Объединяет этот момент с часовым поясом для
        создания ZonedDateTime.
       - static ZoneId of (String zoneId) - Получает экземпляр ZoneId из идентификатора,
        гарантируя, что идентификатор действителен и доступен для использования.
8. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
   прибавляла к дате 42 дня
    - Реализация задачи: [TimeHW_8.java](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/myTimeHW/TimeHW_8.java)
    - Применяемые классы и интерфейсы: [LocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateTime.txt), [ChronoUnit](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ChronoUnitEnum.txt), [Temporal](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/InterfaceTemporal.txt), [TemporalAdjuster](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/TemporalAdjuster.txt)
    - Применяемые методы:
        - static LocalDateTime now () - Получает текущую дату и время по системным
          часам в часовом поясе по умолчанию.
        - LocalDateTime	with (TemporalAdjuster adjuster) - Возвращает скорректированную 
          копию этой даты и времени.
        - Temporal adjustInto (Temporal temporal) - Настраивает указанный временной объект.
        - Temporal plus (long amountToAdd, TemporalUnit unit) - Возвращает объект
          того же типа, что и этот объект, с добавлением указанного периода.

Классы и интерфейсы связные между собой и применяемые при решении задач на время (краткая русифицированная версия):
- [ChronoLocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ChronoLocalDateTime.txt)
- [ChronoUnitEnum](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ChronoUnitEnum.txt)
- [ClassClock](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassClock.txt)
- [ClassDuration](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassDuration.txt)
- [ClassInstant](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassInstant.txt)
- [ClassPeriod](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ClassPeriod.txt)
- [InterfaceTemporal](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/InterfaceTemporal.txt)
- [InterfaceTemporalUnit](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/InterfaceTemporalUnit.txt)
- [LocalDateClass](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateClass.txt)
- [LocalDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/LocalDateTime.txt)
- [TemporalAdjuster](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/TemporalAdjuster.txt)
- [TimeZoneClass](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/TimeZoneClass.txt)
- [ValueBasedClasses](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ValueBasedClasses.txt)
- [ZoneIdClass](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ZoneIdClass.txt)
- [ZonedDateTime](https://github.com/JcoderPaul/JavaBegin/blob/master/Less_28_myTimeLessons/src/DescripReqClassesRus/ZonedDateTime.txt)
