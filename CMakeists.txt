cmake_minimum_required(VERSION 3.11)

project(TweakableLevels VERSION 1.0.1)

message("MinecraftVersion: ${MinecraftVersion}")
include("${CMAKE_CURRENT_LIST_DIR}/Versions/${MinecraftVersion}.txt")
message("Fabric: ${Fabric}")
message("FabricLoader: ${FabricLoader}")

set(ModVersion "${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}.${PROJECT_VERSION_PATCH}")
message("ModVersion: ${ModVersion}")

configure_file("${CMAKE_CURRENT_LIST_DIR}/gradle.properties.in" "${CMAKE_CURRENT_LIST_DIR}/gradle.properties" @ONLY)
configure_file("${CMAKE_CURRENT_LIST_DIR}//src/main/resources/fabric.mod.json.in" "${CMAKE_CURRENT_LIST_DIR}/src/main/resources/fabric.mod.json" @ONLY)
