package com.tineda.tienda.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-1f345.firebasestorage.app";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "mtorres/techshop";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-1f345-firebase-adminsdk-fbsvc-4dfc21b634.json";
}