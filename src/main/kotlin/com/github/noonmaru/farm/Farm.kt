package com.github.noonmaru.farm

object Farm { // Farm 오브젝트; FarmManager 하위 클래스 또는 수정자 라고 해석 가능
    lateinit var manager: FarmManager // lateinit을 통해 FarmManager 타입 변수 manager를 생성
        internal set // The internal visibility modifier means that the member is visible within the same module.
}