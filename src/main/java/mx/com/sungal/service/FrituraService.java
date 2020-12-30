package mx.com.sungal.service;

import java.util.List;
import mx.com.sungal.data.FrituraDao;
import mx.com.sungal.domain.Fritura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("FrituraService")
public class FrituraService implements IService{
    //En esta clase va la logica del negocio

    @Autowired
    FrituraDao frituraDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Object> listarObjeto() {
        List<Object> lista = (List) frituraDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void agregarObjeto(Object obj) {
        Fritura fritura = (Fritura) obj;
        frituraDao.save(fritura);
    }

    @Override
    @Transactional(readOnly = true)
    public Object encontrarObjeto(Object obj) {
        Fritura fritura = (Fritura) obj;
        return frituraDao.findById(fritura.getIdFritura()).orElse(null);
    }

    @Override
    @Transactional
    public void borrarObjeto(Object obj) {
        Fritura fritura = (Fritura) obj;
        frituraDao.delete(fritura);
    }
    
}
