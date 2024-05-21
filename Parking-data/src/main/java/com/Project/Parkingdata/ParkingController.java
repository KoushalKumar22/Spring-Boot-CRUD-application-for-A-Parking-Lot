package com.Project.Parkingdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.DataTruncation;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@RestController
public class ParkingController {

    @Autowired
    ParkingRepository prepo;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @RequestMapping("/save")
    public String parking(@RequestBody Parkingdata parking){
        prepo.save(parking);
        return "Data Has Been Saved";
    }

    @GetMapping("/all")
    public List<Parkingdata>all(){
        return prepo.findAll();
    }


    @RequestMapping("/{id}")
    public Optional<Parkingdata> byid(@PathVariable int id)
    {
        return prepo.findById(id);
    }

    @RequestMapping("/vname/{vname}")
    public Optional<Parkingdata> byVname(@PathVariable String vname){
        return prepo.findByVname(vname);
    }

    @GetMapping("/etime/{etime}")
    public Optional<Parkingdata> byetime(@PathVariable String etime){
        LocalTime time = LocalTime.parse(etime);
        return prepo.findByetime(time);
    }

    @GetMapping("/ltime/{ltime}")
    public Optional<Parkingdata> byltime(@PathVariable String ltime){
        LocalTime time = LocalTime.parse(ltime);
        return prepo.findByltime(time);
    }

    @GetMapping("/dname/{dname}")
    public Optional<Parkingdata> bydname(@PathVariable String dname) {
        return prepo.findBydname(dname);
    }


    @PutMapping("/parkingdata/{id}")
    public Parkingdata updateParkingdata(@PathVariable int id, @RequestBody Parkingdata updatedParkingdata) {
        return prepo.findById(id)
                .map(parkingdata -> {
                    parkingdata.setVname(updatedParkingdata.getVname());
                    parkingdata.setEtime(updatedParkingdata.getEtime());
                    parkingdata.setLtime(updatedParkingdata.getLtime());
                    parkingdata.setVno(updatedParkingdata.getVno());
                    parkingdata.setDname(updatedParkingdata.getDname());
                    return prepo.save(parkingdata);
                })
                .orElseGet(() -> {
                    updatedParkingdata.setId(id);
                    return prepo.save(updatedParkingdata);
                });
    }
}
