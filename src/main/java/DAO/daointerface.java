package DAO;

import java.util.List;

public interface daointerface<E> {

    public int addData(E data);
    public int delData(E data);
    public int updateData(E data);

    public List<E> showData();

}
