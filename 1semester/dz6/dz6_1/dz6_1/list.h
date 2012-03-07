#pragma once

#include <string>

struct TelephoneDirectory;
struct DataAboutMen;

// ������� ������ ���� ������� - ������ ������
TelephoneDirectory *createTelephoneDirectory();

// ��������� ������ � ����
void add(TelephoneDirectory *telephoneDirectory, std::string name, int tel);

// ���� �� �����
void foundByName(TelephoneDirectory *telephoneDirectory, std::string foundName);

// ���� �� ��������
void foundByTel(TelephoneDirectory *telephoneDirectory, int foundTel);

// �������� ����-������
void printTelephoneDirectory(TelephoneDirectory *telephoneDirectory);

// ��������� ������� ������ � ����
void saveToFile(TelephoneDirectory *telephoneDirectory);

// ��������� ���� � ����� � ������
void readFromFile(TelephoneDirectory *telephoneDirectory);

//  ���������� ���������� ��� ������ ������.
void delTelephoneDirectory(TelephoneDirectory *telephoneDirectory);

// ��������� ������ ������
DataAboutMen *getHead(TelephoneDirectory *telephoneDirectory);

// ���������� ��������� �� i ������� ������
DataAboutMen *getNext(TelephoneDirectory *telephoneDirectory, DataAboutMen *i);

// ���������� ���������� ��������� ������
int getCount(TelephoneDirectory *telephoneDirectory);

// ���������� ��� � �������� i ������
std::string getName(TelephoneDirectory *telephoneDirectory, DataAboutMen *i);

// ���������� ������� � �������� i ������
int getTel(TelephoneDirectory *telephoneDirectory, DataAboutMen *i);