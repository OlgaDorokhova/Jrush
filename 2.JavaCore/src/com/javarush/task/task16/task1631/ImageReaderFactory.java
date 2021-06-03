package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        ImageReader imageReader;
        if (type == ImageTypes.JPG) imageReader = new JpgReader();
        else if (type == ImageTypes.BMP) imageReader = new BmpReader();
        else if (type == ImageTypes.PNG) imageReader = new PngReader();
        else throw new IllegalArgumentException("Неизвесный тип картинки");
        return imageReader;
    }
}
