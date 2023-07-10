import axios from "axios";

const API_URL = '/team'

class Service {

    create(request) {
        return axios.post(API_URL , request);
    }

    update(id,request) {
        return axios.put(API_URL ,id, request);
    }

    getAll() {
        return axios.get(API_URL);
    }

    getName() {
        return axios.get(API_URL + "/name");
    }

    delete(id) {
        return axios.delete(API_URL + "/" + id);
    }

}

export default new Service();