package mx.com.sungal.service;

import java.util.List;
import mx.com.sungal.data.FrutaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.com.sungal.domain.Fruta;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

@Service
@Qualifier("FrutaService")
public class FrutaService implements IService {

    @Autowired
    private FrutaDao frutaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Object> listarObjeto() {
        List<Object> lista = (List) frutaDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void agregarObjeto(Object obj) {
        Fruta fruta = (Fruta) obj;
        frutaDao.save(fruta);
    }

    @Override
    @Transactional(readOnly = true)
    public Object encontrarObjeto(Object obj) {
        Fruta fruta = (Fruta) obj;
        return frutaDao.findById(fruta.getIdFruta()).orElse(null);
    }

    @Override
    @Transactional
    public void borrarObjeto(Object obj) {
        Fruta fruta = (Fruta) obj;
        frutaDao.delete(fruta);
    }
}
