package post.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import post.models.Log;
import post.repositories.LogRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LogService {


    @Autowired
    private LogRepository logRepository;



    public List<Log> getAll(){
       return logRepository.findAll();

    }



    public Optional<Log>  getLogById(int id){
          return logRepository.findById(id);
    }

    public void addLog(Log log){
        logRepository.save(log);
    }

}
