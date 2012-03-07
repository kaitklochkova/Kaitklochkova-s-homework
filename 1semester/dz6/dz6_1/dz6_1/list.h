#pragma once

#include <string>

struct TelephoneDirectory;
struct DataAboutMen;

// создает пустую базу номеров - пустой список
TelephoneDirectory *createTelephoneDirectory();

// добавляет запись в базу
void add(TelephoneDirectory *telephoneDirectory, std::string name, int tel);

// ищет по имени
void foundByName(TelephoneDirectory *telephoneDirectory, std::string foundName);

// ищет по телефону
void foundByTel(TelephoneDirectory *telephoneDirectory, int foundTel);

// печатает базу-список
void printTelephoneDirectory(TelephoneDirectory *telephoneDirectory);

// сохраняет текущие данные в файл
void saveToFile(TelephoneDirectory *telephoneDirectory);

// считывает базу с файла в массив
void readFromFile(TelephoneDirectory *telephoneDirectory);

//  очистищает выделенную под список память.
void delTelephoneDirectory(TelephoneDirectory *telephoneDirectory);

// возвращет голову списка
DataAboutMen *getHead(TelephoneDirectory *telephoneDirectory);

// возвращает следующий за i элемент списка
DataAboutMen *getNext(TelephoneDirectory *telephoneDirectory, DataAboutMen *i);

// возвращает количество элементов списка
int getCount(TelephoneDirectory *telephoneDirectory);

// возвращает имя в элементе i списка
std::string getName(TelephoneDirectory *telephoneDirectory, DataAboutMen *i);

// возвращает телефон в элементе i списка
int getTel(TelephoneDirectory *telephoneDirectory, DataAboutMen *i);