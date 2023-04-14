/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Uncertainty;


/**
 *
 * @author 27323
 */
public class Calculate {
    
    public static float average,uncertaintyA,uncertaintyB,uncertainty;
    public float[] list;
    public int n;
    
    Calculate(float[] list,float UncertaintyB){
        this.list = list;
        this.n = list.length;
        this.setAverage();
        this.setUncertaintyA();
        this.setUncertaintyB(UncertaintyB);
        this.setUncertainty();
    }
    
    private void setUncertainty(){
        uncertainty = (float)Math.pow(Math.pow(getUncertaintyA(),2)+Math.pow(getUncertaintyB(),2),0.5);
    }
    
    public float getUncertainty(){
        return uncertainty;
    }
    
    private void setAverage() {
        float count = 0;
        for (int i = 0; i < n; i++) {count += list[i];}
        average = count/n;
    }
    public float getAverage(){
        return average;
    }

    public float[] getList(){
        return list;
    }
    public final void setUncertaintyA(){
        float count = 0;
        for(int i=0;i<n;i++){
            count += Math.pow((list[i] - average),2);
        }
        uncertaintyA = (float) Math.pow((count/(n*(n-1))),0.5);
    }
    public float getUncertaintyA(){
        return uncertaintyA;
    }

    public final void setUncertaintyB(Float i){
        uncertaintyB = i;
    }
    public float getUncertaintyB(){
        return uncertaintyB;
    }
}
