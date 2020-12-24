package mx.com.sungal.service;

import java.util.List;

public interface IService {
    
    public List<Object> listarObjeto();
    
    public void agregarObjeto(Object obj);
    
    public Object encontrarObjeto(Object obj);
    
    public void borrarObjeto(Object obj);
    
}
