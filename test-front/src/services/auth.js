import TakmicenjeAxios from "../apis/TakmicenjeAxios"

export const login = async function (username, password){
    const data = {
        username: username,
        password: password
    }
    try{
        const ret = await TakmicenjeAxios.post('users/auth', data);
        window.localStorage.setItem('jwt', ret.data);
    }catch(error){
        console.log(error);
    }
    window.location.assign("/");
}
export const logout = function(){
    window.localStorage.removeItem('jwt');
    window.location.assign("/");
}