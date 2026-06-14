package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Virus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Virus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getVirus", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_virus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VirusKt {
    private static ImageVector _virus;

    public static final ImageVector getVirus(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _virus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Virus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(134.0f, 108.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 134.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 122.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 108.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 128.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 190.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(142.0f, 176.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 142.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 122.0f);
        pathBuilder.lineTo(221.8f, 122.0f);
        pathBuilder.arcToRelative(93.57f, 93.57f, 0.0f, false, false, -23.26f, -56.06f);
        pathBuilder.lineToRelative(13.7f, -13.7f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f);
        pathBuilder.lineToRelative(-13.7f, 13.7f);
        pathBuilder.arcTo(93.57f, 93.57f, 0.0f, false, false, 134.0f, 34.2f);
        pathBuilder.lineTo(134.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 34.2f);
        pathBuilder.arcTo(93.57f, 93.57f, 0.0f, false, false, 65.94f, 57.46f);
        pathBuilder.lineToRelative(-13.7f, -13.7f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineToRelative(13.7f, 13.7f);
        pathBuilder.arcTo(93.57f, 93.57f, 0.0f, false, false, 34.2f, 122.0f);
        pathBuilder.lineTo(16.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(34.2f, 134.0f);
        pathBuilder.arcToRelative(93.57f, 93.57f, 0.0f, false, false, 23.26f, 56.06f);
        pathBuilder.lineToRelative(-13.7f, 13.7f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(13.7f, -13.7f);
        pathBuilder.arcTo(93.57f, 93.57f, 0.0f, false, false, 122.0f, 221.8f);
        pathBuilder.lineTo(122.0f, 240.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 221.8f);
        pathBuilder.arcToRelative(93.57f, 93.57f, 0.0f, false, false, 56.06f, -23.26f);
        pathBuilder.lineToRelative(13.7f, 13.7f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineToRelative(-13.7f, -13.7f);
        pathBuilder.arcTo(93.57f, 93.57f, 0.0f, false, false, 221.8f, 134.0f);
        pathBuilder.lineTo(240.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 210.0f);
        pathBuilder.arcToRelative(82.0f, 82.0f, 0.0f, true, true, 82.0f, -82.0f);
        pathBuilder.arcTo(82.1f, 82.1f, 0.0f, false, true, 128.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _virus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
