/*****************************************************************************
 *                        Shapeways, Inc Copyright (c) 2011
 *                               Java Source
 *
 * This source is licensed under the GNU LGPL v2.1
 * Please read http://www.gnu.org/copyleft/lgpl.html for more information
 *
 * This software comes with the standard NO WARRANTY disclaimer for any
 * purpose. Use it at your own risk. If there's a problem you get to fix it.
 *
 ****************************************************************************/

package abfab3d.grid;

/**
 * Contains the data portion of a voxel.
 *
 * @author Alan Hudson
 */
public class VoxelDataShort implements VoxelData {
    /** The voxel state */
    private byte state;

    /** The material */
    private short material;

    public VoxelDataShort(byte state, int material) {
        this.state = state;
        this.material = (short) material;
    }

    /**
     * Get the state.
     *
     * @return The state
     */
    public byte getState() {
        return state;
    }

    /**
     * Get the material.
     *
     * @return The material
     */
    public int getMaterial() {
        return material;
    }

    /**
     * Set the state.
     *
     * @param state The new state
     */
    public void setState(byte state) {
        this.state = state;
    }

    /**
     * Set the material.
     *
     * @param mat The material
     */
    public void setMaterial(int mat) {
        this.material = (short) mat;
    }

    /**
     * Set the state and material
     *
     * @param state The state
     * @param mat The material
     */
    public void setData(byte state, int mat) {
        this.state = state;
        this.material = (short) mat;
    }

    /**
     * Clone this object.
     *
     * @return The cloned object
     */
    public Object clone() {
        return new VoxelDataByte(state, material);
    }
}