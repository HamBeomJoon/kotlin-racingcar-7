package racingcar.controller

import camp.nextstep.edu.missionutils.Console

class RacingController {

    fun start() {
        printInputCarName()
        val input = Console.readLine().split(",")
        printInputRaceCount()
        val raceCount = Console.readLine().toInt()

    }

    private fun printInputCarName() = println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    private fun printInputRaceCount() = println("시도할 횟수는 몇 회인가요?")

}