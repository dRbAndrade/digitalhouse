import image from '../assets/kozuki.jfif'
import '../styles/banner.css'
function Banner({children}){
    return(
        <div className="banner">
            <img src={image} alt="Kozuki Family Crest" />
            {children}
        </div>
    );
}

export default Banner;