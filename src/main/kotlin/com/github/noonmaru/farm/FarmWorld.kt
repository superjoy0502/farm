package com.github.noonmaru.farm

import org.bukkit.World

interface FarmWorld { // FarmWorld ==> 서버 월드들을 해당 플러그인에서 관리하기 위한 인터페이스
    val name: String // 월드 이름 (String)
    val bukkitWorld: World // 월드 (org.bukkit.World)
    val loadedChunks: List<FarmChunk> // 로딩된 청크 리스트 (List<FarmChunk>)

    fun chunkAt(x: Int, z: Int): FarmChunk? // x, z 좌표를 입력받고 해당 위치의 팜청크를 반환; null값이 반환될 수 있음

    fun cropAt(x: Int, y: Int, z: Int): FarmCrop? // x, y, z 좌표를 입력받고 해당 위치에 있는 작물을 반환; null값이 반환될 수 있음
}

val World.farmWorld: FarmWorld // World.farmWorld 변수 생성; org.bukkit.World 클래스 안의 변수; 다른 절차 없이 World 클래스를 이용해 호출 할 수 있음
    get() { // World.farmWorld를 불러올 때
        return Farm.manager.getWorld(this) // Farm 오브젝트의 manager를 통해 FarmManager.getWorld()를 호출 및 반환
    }