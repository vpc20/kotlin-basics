import java.time.*
import java.time.temporal.ChronoUnit
import java.time.temporal.TemporalAdjusters
import java.util.*
import java.util.concurrent.TimeUnit


fun main() {
//    println("LocalDateTime.now() ${LocalDateTime.now()}")
//
//    val s = "Mon, 09 Dec 2019 18:03:21 +0000"
//    val d1 = LocalDateTime.ofInstant(Date(s).toInstant(), ZoneId.systemDefault())
//    println(d1)
//
//    val months = listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
//    val x = LocalDateTime.of(
//            s.substring(12, 16).toInt(),
//            months.indexOf(s.substring(8, 11)) + 1,
//            s.substring(5, 7).toInt(),
//            s.substring(17, 19).toInt(),
//            s.substring(20, 22).toInt())
//    println(x)

    //Local Date
    println(LocalDate.of(2015, 2, 20))
    println(LocalDate.parse("2015-02-20"))

    val today = LocalDate.now()
    println("Today: $today")
    val tomorrow = LocalDate.now().plusDays(1)
    println("Tomorrow: $tomorrow")
    val nextWeek = LocalDate.now().plusWeeks(1)
    println("Next week: $nextWeek")
    val nextMonth = LocalDate.now().plusMonths(1)
    println("Next Month: $nextMonth")
    val nextYear = LocalDate.now().plusYears(1)
    println("Next Year: $nextYear")

    val previousMonthSameDay: LocalDate = LocalDate.now().minus(1, ChronoUnit.MONTHS)
    println("previousMonthSameDay: $previousMonthSameDay")

    val dayOfWeek = LocalDate.parse("2016-06-12").dayOfWeek
    println("dayOfWeek 2016-06-12: $dayOfWeek")
    val dayOfMonth = LocalDate.parse("2016-06-12").dayOfMonth
    println("dayOfMonth 2016-06-12: $dayOfMonth")

    val leapYear = LocalDate.now().isLeapYear
    println("This year is leap year : $leapYear")

//  The relationship of a date to another can be determined to occur before or
//  after another date:
    val isEqual = LocalDate.parse("2016-06-12")
            .isEqual(LocalDate.parse("2016-06-11"))
    println("2016-06-12 is equal 2016-06-11: $isEqual")
    val isBefore = LocalDate.parse("2016-06-12")
            .isBefore(LocalDate.parse("2016-06-11"))
    println("2016-06-12 is before 2016-06-11: $isBefore")
    val isAfter = LocalDate.parse("2016-06-12")
            .isAfter(LocalDate.parse("2016-06-11"))
    println("2016-06-12 is after 2016-06-11: $isAfter")

    val startOfDay = LocalDate.parse("2016-06-12").atStartOfDay()
    println("2016-06-12 start of day: $startOfDay")
    val firstDayOfMonth = LocalDate.parse("2016-06-12")
            .with(TemporalAdjusters.firstDayOfMonth())
    println("2016-06-12 start of day: $firstDayOfMonth")


    // Local time
    val now = LocalTime.now()
    println("\nCurrent time: $now")

    val sixThirty = LocalTime.parse("06:30")
    println("sixThirty: $sixThirty")

    val fiveThirty = LocalTime.of(5, 30)
    println("fiveThirty: $fiveThirty")

    val timeAddMinutes = LocalTime.parse("06:30").plus(1, ChronoUnit.MINUTES)
    println("06:30 + 1 minute: $timeAddMinutes")
    val timeAddHours = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS)
    println("06:30 + 1 hour: $timeAddHours")

    val isBeforeTime = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"))
    println("06:30 is before 07:30: $isBeforeTime")
    val isAfterTime = LocalTime.parse("06:30").isAfter(LocalTime.parse("07:30"))
    println("06:30 is after 07:30: $isAfterTime")

    val midnight: LocalTime = LocalTime.MIDNIGHT
    println("midmnight: $midnight")
    val noon: LocalTime = LocalTime.NOON
    println("midmnight: $noon")
    val minTime: LocalTime = LocalTime.MIN
    println("minTime: $minTime")
    val maxTime: LocalTime = LocalTime.MAX
    println("maxTime: $maxTime")

    // Local datetime
    val localDateTimeNow = LocalDateTime.now()
    println("\nLocalDateTime: $localDateTimeNow")

    println(LocalDateTime.of(2015, Month.FEBRUARY, 20, 6, 30))
    println(LocalDateTime.of(2015, Month.valueOf("FEBRUARY").ordinal, 20, 6, 30))
    println(LocalDateTime.of(2015, 2, 20, 6, 30))
    println(LocalDateTime.parse("2015-02-20T06:30:00"))

    // The Period class is widely used to modify values of given a date or
    // to obtain the difference between two dates:
    val initialDate = LocalDate.parse("2007-05-10")
    println("\ninitialDate: $initialDate")
    val finalDate = initialDate.plus(Period.ofDays(5))
    println("finalDate plus 5 days: $finalDate")

    val periodBetween = Period.between(initialDate, finalDate).days
    println("period between initialDate and finalDate: $periodBetween days")
    val chronoDaysBetween = ChronoUnit.DAYS.between(initialDate, finalDate)
    println("chrono days between initialDate and finalDate: $chronoDaysBetween ")

    // Similar to Period, the Duration class is used to deal with Time
    val initialTime = LocalTime.of(6, 30, 0)
    println("\ninitialTime: $initialTime")
    val finalTime = initialTime.plus(Duration.ofSeconds(30))
    println("initialTime plus 30 seconds: $finalTime")
    val durationBetween = Duration.between(initialTime, finalTime).seconds
    println("duration between initialTime and finalTime in seconds: $durationBetween")
    val chronoSecondsBetween = ChronoUnit.SECONDS.between(initialTime, finalTime)
    println("chrono between initialTime and finalTime in seconds: $chronoSecondsBetween")

    // Using ZonedDateTime API
    val allZoneIds: MutableSet<String> = ZoneId.getAvailableZoneIds()
    println(allZoneIds)

    val zoneId = ZoneId.of("Europe/Paris")
    val zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId)
    println("\nZonedDateTime: $zonedDateTime")
    println(ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"))

    val localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 6, 30)
    println("\nlocalDateTime: $localDateTime")
    val offset = ZoneOffset.of("+02:00")
    val offSetByTwo: OffsetDateTime = OffsetDateTime.of(localDateTime, offset)
    println("offset localDateTime by +2: $offSetByTwo")

    // converting to default time zone
    println("\n*****")
    val pubDate = "Mon, 09 Dec 2019 18:03:21 +0000"
    val pubLocalDateTime = LocalDateTime.ofInstant(Date(pubDate).toInstant(), ZoneId.systemDefault())
    println(pubLocalDateTime)

    val periodBetweenx = Duration.between(pubLocalDateTime, LocalDateTime.now()).toDays()
    if (periodBetweenx < 1)
        println("Today")
    else
        println("$periodBetweenx days ago")

    // convert to default time zone using the deprecated Date class in Java
    val date1 = "Mon, 09 Dec 2019 18:03:21 +0000"
    val date1x = Date(date1).time //automaticall converted to default time zone
    val date2x = Calendar.getInstance().time.time
    val diff = date2x - date1x
    val durationDays = TimeUnit.DAYS
            .convert(diff, TimeUnit.MILLISECONDS)
    println(durationDays)

}