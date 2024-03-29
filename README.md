# Frequency Dictionary

Это простая программа на Java, которая считает частоту встречаемости символов английского алфавита в текстовом файле и записывает результаты в другой файл.

## Установка

1. Скачайте файл `FrequencyDictionary.java`.
2. Убедитесь, что на вашем компьютере установлена Java Development Kit (JDK).
3. Откройте командную строку и перейдите в каталог, содержащий файл `FrequencyDictionary.java`.
4. Скомпилируйте файл с помощью команды:
```bash 
   javac FrequencyDictionary.java
```

## Запуск

Программа принимает два аргумента командной строки: входной файл (файл, который нужно проанализировать) и выходной файл (файл, куда будут записаны результаты).

Для запуска программы выполните следующую команду в командной строке:

```bash 
   java FrequencyDictionary inputFileName outputFileName
```

Где `inputFileName` - это путь к входному файлу, а `outputFileName` - путь к выходному файлу.

## Пример использования

Предположим, у нас есть файл `input.txt` с текстом. Мы хотим подсчитать частоту встречаемости символов в этом файле и записать результаты в файл `output.txt`. Для этого выполним следующую команду:

```bash 
   java FrequencyDictionary input.txt output.txt
```

## Обработка исключений

Программа обрабатывает следующие исключения:
- `FileNotFoundException`: возникает, если указанный входной файл не найден или указанный выходной файл не может быть создан или доступен для записи.

В случае возникновения исключения будет выведено сообщение об ошибке.
