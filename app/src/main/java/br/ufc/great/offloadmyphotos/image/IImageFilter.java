package br.ufc.great.offloadmyphotos.image;

import br.ufc.great.caos.api.offload.Offloadable;


public interface IImageFilter {

    @Offloadable
    public byte[] mapTone(byte source[], byte map[]);

    @Offloadable
    public int[][] mapTone(int source[][], int map[][]);

    @Offloadable
    public byte[] cartoonizerImage(byte source[]);

    @Offloadable
    public int[][] cartoonizerImage(int source[][]);

    @Offloadable
    public byte[] filterApply(byte source[], double filter[][], double factor, double offset);

    @Offloadable
    public int[][] filterApply(int source[][], double filter[][], double factor, double offset);

    @Offloadable
    public int[][] greyScaleImage(int source[][]);

    @Offloadable
    public int[][] colorDodgeBlendOptimized(int source[][], int layer[][]);

    @Offloadable
    public int[][] invertColors(int source[][]);

    @Offloadable
    public int colordodge(int in1, int in2);

}
