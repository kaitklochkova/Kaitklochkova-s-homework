#pragma once

struct Hash;

// хэш-функция
int hashFun(char *str);

// добавляет str в hash
void addHash(char *str, Hash *hash);

// печатает хэш-таблицу
void printHash(Hash * hash);

//создает пустую хэш-таблицу
Hash *createHash();

// удаляет хэш-таблицу
void delHash(Hash *hash);